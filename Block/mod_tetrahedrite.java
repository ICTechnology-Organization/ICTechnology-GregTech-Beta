package net.minecraft.src;
 
public class mod_tetrahedrite extends BaseMod{
 
    public static Block oreTetrahedrite;
    public int blockID;
    public String fileToOverride;
    public String textureFilePath;
 
    public mod_tetrahedrite()
    {
    }
    public void load()
    {
    	blockID = ;
    	fileToOverride = "/terrain.png";
    	textureFilePath = "/block/tetrahedrite.png";
　　　　
    	oreTetrahedrite = new BlockTetrahedrite(blockID, ModLoader.addOverride(fileToOverride, textureFilePath));
　　　　
    	oreTetrahedrite.setHardness(3F);
　　　　
    	oreTetrahedrite.setBlockName("oreTetrahedrite");
　　　　
    	oreTetrahedrite.setResistance(5F);
　　　　
    	oreTetrahedrite.setStepSound(Block.soundStoneFootstep);
　　　　
    	oreTetrahedrite.setLightValue(1.0F);
　　　　
    	ModLoader.registerBlock(oreTetrahedrite);
　　　　
        ModLoader.addName(oreTetrahedrite, "Tetrahedrite Ore");
    }
    public String getVersion()
    {
            return "1.0.0";
    }
}
