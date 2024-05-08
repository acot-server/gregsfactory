import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.RecipeMapBuilder
import gregtech.api.recipes.builders.SimpleRecipeBuilder
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.MetaBlocks
import gregtech.common.blocks.BlockGlassCasing
import gregtech.common.blocks.BlockFusionCasing

class BlackHoleGeneratorMkIController extends RecipeMapMultiblockController {

    public static final RecipeMap RECIPE_MAP =
	new RecipeMapBuilder<>("black_hole_generator_1", new SimpleRecipeBuilder())
	.itemInputs(2)
	.itemOutputs(0)
	.fluidInputs(2)
	.fluidOutputs(1)
	.sound(GTSoundEvents.ARC)
	.build()
    
    BlackHoleGeneratorMkIController(ResourceLocation metaTileEntityId) {
	super(metaTileEntityId, RECIPE_MAP)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
	return new BlackHoleGeneratorMkIController(metaTileEntityId)
    }

    @Override
    protected BlockPattern createStructurePattern() {
	return FactoryBlockPattern.start()
            .aisle("CCCCC", "CCCCC", "CGGGC", "CCCCC", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "C#D#C", "GDRDG", "C#D#C", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "CCSCC", "CGGGC", "CCCCC", "CCCCC")
	    .where('S', selfPredicate())
	    .where('G', MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS))
	    .where(
		'C',
		MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING)
		    .or(autoAbilities())
	    )
	    .where('D', MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL))
	    .where('G', blockstate('minectraft:stone'))
	    .where('#', air())
	    .build()
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
	return Textures.FUSION_TEXTURE
    }
    
    @Override
    protected ICubeRenderer getFrontOverlay() {
	return Textures.FUSION_REACTOR_OVERLAY
    }
}
