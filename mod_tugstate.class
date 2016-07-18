package net.minecraft.src;
 
public class mod_tungstate extends BaseMod{
 
    public static Block oreTungstate;
    public int blockID;
    public String fileToOverride;
    public String textureFilePath;
 
    public mod_tungstate()
    {
    }
    public void load()
    {
    	blockID = ;
    	fileToOverride = "/terrain.png";
    	textureFilePath = "/block/tungstate.png";
　　　　
    	oreTungstate = new BlockTungstate(blockID, ModLoader.addOverride(fileToOverride, textureFilePath));
　　　　
    	oreTungstate.setHardness(3F);
　　　　
    	oreTungstate.setBlockName("oreTungstate");
　　　　
    	oreTungstate.setResistance(5F);
　　　　
    	oreTungstate.setStepSound(Block.soundStoneFootstep);
　　　　
    	oreTungstate.setLightValue(1.0F);
　　　　
    	ModLoader.registerBlock(oreTungstatr);
　　　　
        ModLoader.addName(oreTungstate, "Tungstate Ore");
    }
    public String getVersion()
    {
            return "1.0.0";
    }
}
