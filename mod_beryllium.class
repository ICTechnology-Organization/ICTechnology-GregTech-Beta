package net.minecraft.src;
 
public class mod_beryllium extends BaseMod{
 
    public static Block oreBeryllium;
    public int blockID;
    public String fileToOverride;
    public String textureFilePath;
 
    public mod_beryllium()
    {
    }
    public void load()
    {
    	blockID = ;
    	fileToOverride = "/terrain.png";
    	textureFilePath = "/block/beryllium.png";
　　　　
    	oreBeryllium = new BlockBeryllium(blockID, ModLoader.addOverride(fileToOverride, textureFilePath));
　　　　
    	oreBeryllium.setHardness(3F);
　　　　
    	oreBeryllium.setBlockName("oreBeryllium");
　　　　
    	oreBeryllium.setResistance(5F);
　　　　
    	oreBeryllium.setStepSound(Block.soundStoneFootstep);
　　　　
    	oreBeryllium.setLightValue(1.0F);
　　　　
    	ModLoader.registerBlock(oreBeryllium);
　　　　
        ModLoader.addName(oreBeryllium, "Beryllium Ore");
    }
    public String getVersion()
    {
            return "1.0.0";
    }
}
