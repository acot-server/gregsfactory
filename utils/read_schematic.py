import sys
from litemapy import *
from nbtlib import *

with open(sys.argv[1], "rb") as f:
    cpd = Compound.parse(f)

reg = Schematic.fromnbt(cpd['']).regions['Unnamed']

ids = {
    "minecraft:air": ' '
}

nextid = 0x41


for x in reg.xrange():
    print(".aisle(")
    for y in reg.yrange():
        print("    \"", end="")
        for z in reg.zrange():
            b = reg.getblock(x, y, z).blockid
            if b not in ids.keys():
                ids[b] = chr(nextid)
                nextid += 1
            print(ids[b], end="")
        print("\"", end="")
        if y != reg.maxy(): print(",", end="")
        print()
    print(")")

for k in ids.keys():
    print(".where('" + ids[k] + "' as char, " + k + ")")
    
