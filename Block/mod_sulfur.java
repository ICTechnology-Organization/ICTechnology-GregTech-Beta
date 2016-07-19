package net.minecraft.src;
 
public class mod_sulfur extends BaseMod{
 
    public static Block oreSulfur;
    public int blockID;
    public String fileToOverride;
    public String textureFilePath;
 
    public mod_sulfur()
    {
    }
    public void load()
    {
    	blockID = ;
    	fileToOverride = "/terrain.png";
    	textureFilePath = "/block/sulfur.png";
　　　　
    	oreSulfur = new BlockSulfur(blockID, ModLoader.addOverride(fileToOverride, textureFilePath));
　　　　
    	oreSulfur.setHardness(3F);
　　　　
    	oreSulfur.setBlockName("oreSulfur");
　　　　
    	oreSulfur.setResistance(5F);
　　　　
    	oreSulfur.setStepSound(Block.soundStoneFootstep);
　　　　
    	oreSulfur.setLightValue(1.0F);
　　　　
    	ModLoader.registerBlock(oreSulfur);
　　　　
        ModLoader.addName(oreSulfur, "Sulfur Ore");
    }
    public String getVersion()
    {
            return "1.0.0";
    }
}
