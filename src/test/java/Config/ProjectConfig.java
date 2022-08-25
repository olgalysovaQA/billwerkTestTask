package Config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface ProjectConfig extends Config {

    @Key("url")
    String url();

    @Key("browser")
    String browser();

    @Key("dropDownPath")
    String dropDownPath();

}
