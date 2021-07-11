public class AdvancedEnum {
    enum COLOR{
        RED("RED"),
        BLUE("BLUE");
        private String value;
        public String getValue()
        {
           return this.value;
        }
        COLOR(String value)
        {
            this.value=value;
        }
    }
}
