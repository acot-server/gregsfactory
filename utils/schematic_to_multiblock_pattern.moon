import unpack from require"struct"
import p from require"moon"

local parse
local valueof
  
valueof = {
  0: => nil
  1: => unpack ">b", @read 1
  2: => unpack ">h", @read 2
  3: => unpack ">i", @read 4
  4: => unpack ">l", @read 8
  5: => unpack ">f", @read 4
  6: => unpack ">d", @read 8
  7: =>
    len = unpack ">i", @read 4
    value = {}
    for i = 1, len
      value[i] = unpack ">b", @read 1
    value
  8: =>
    len = unpack ">H", @read 2
    @read len
  9: =>
    type = unpack ">B", @read 1
    len = unpack ">i", @read 4
    value = {}
    for i = 1, len
      value[i] = valueof[type] @
    value
  10: =>
    value = {}
    while true
      tag = parse @
      break if tag == nil
      value[tag.name] = tag.value
    value
  11: =>
    len = unpack ">i", @read 4
    value = {}
    for i = 1, len
      value[i] = unpack ">i", @read 4
    value
  12: =>
    len = unpack ">i", @read 4
    value = {}
    for i = 1, len
      value[i] = unpack ">l", @read 8
    value
}

parse = =>
  data = @read 1
  type = unpack ">B", data
  return nil if type == 0
  nlen = unpack ">H", @read 2
  name = @read nlen
  value = valueof[type] @
  {:name, :value}
    

args = {...}


nbt = io.open(args[1], "rb")

p parse nbt
      
