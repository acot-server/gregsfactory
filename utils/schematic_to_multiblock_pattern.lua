local p = require("moon").p
local unpack = string.unpack
local pack = string.pack
local parse
local valueof
  
valueof = {
   [0] = function(f) return nil end,
   [1] = function(f) return unpack(">i1", f:read(1)) end,
   [2] = function(f) return unpack(">i2", f:read(2)) end,
   [3] = function(f) return unpack(">i4", f:read(4)) end,
   [4] = function(f) return unpack(">i8", f:read(8)) end,
   [5] = function(f) return unpack(">f", f:read(4)) end,
   [6] = function(f) return unpack(">d", f:read(8)) end,
   [7] = function(f)
      local len = unpack(">i4", f:read(4))
      local value = {}
      for i = 1, len do
	 value[i] = unpack(">I1", f:read(1))
      end
      return value
   end,
   [8] = function(f)
      local len = unpack(">I2", f:read(2))
      return f:read(len)
   end,
   [9] = function(f)
      local typ = unpack(">I1", f:read(1))
      local len = unpack(">i4", f:read(4))
      local value = {_oftype = typ}
      for i = 1, len do value[i] = valueof[typ](f) end
      return value
   end,
   [10] = function(f)
      local value = {}
      while true do
	 local tag = parse(f)
	 if tag == nil then break end
	 value[tag.name] = tag.value
	 value[tag.name .. " /Type"] = tag._oftype
      end
      return value
   end,
   [11] = function(f)
      local len = unpack(">i4", f:read(4))
      local value = {}
      for i = 1, len do value[i] = unpack(">i4", f:read(4)) end
      return value
   end,
   [12] = function(f)
      local len = unpack(">i4", f:read(4))
      local value = {}
      for i = 1, len do value[i] = unpack(">i8", f:read(8)) end
      return value
   end
}

parse = function(f)
   local typ = unpack(">i1", f:read(1))
   if typ == 0 then return nil end
   local nlen = unpack(">I2", f:read(2))
   local name = f:read(nlen)
   local value = valueof[typ](f)
   return {name = name, value = value, _oftype=typ}
end

local args = {...}

local nbt = parse(io.open(args[1], "rb"))
nbt = nbt.value.Regions.Unnamed

local longBitsToUnsignedLong
longToUnsignedBits = function(l)
   return unpack(">L", pack(">l", l))
end

require("moon").p(nbt)


