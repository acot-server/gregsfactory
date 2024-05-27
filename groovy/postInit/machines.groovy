import gregtech.common.metatileentities.MetaTileEntities
import classes.MetaTileEntityBlackHoleGeneratorMkI


if (isReloading()) return

MetaTileEntities.registerMetaTileEntity(
    25000,
    new MetaTileEntityBlackHoleGeneratorMkI(
	new ResourceLocation("qilby", "black_hole_generator_1")))

