package net.minecraft.src;
 
public class mod_cassiterite extends BaseMod{
 
    public static Block oreCassiterite;
    public int blockID;
    public String fileToOverride;
    public String textureFilePath;
 
    public mod_cassiterite()
    {
    }
    public void load()
    {
    	blockID = ;
    	fileToOverride = "/terrain.png";
    	textureFilePath = "/block/cassiterite.png";
　　　　
    	oreCassiterite = new BlockCassiterite(blockID, ModLoader.addOverride(fileToOverride, textureFilePath));
　　　　
    	oreCassiterite.setHardness(3F);
　　　　
    	oreCassiterite.setBlockName("oreCassiterite");
　　　　
    	oreCassiterite.setResistance(5F);
　　　　
    	oreCassiterite.setStepSound(Block.soundStoneFootstep);
　　　　
    	oreCassiterite.setLightValue(1.0F);
　　　　
    	ModLoader.registerBlock(oreMagnetite);
　　　　
        ModLoader.addName(oreCassiterite, "Cassiterite Ore");
    }
    public String getVersion()
    {
            return "1.0.0";
    }
}
