public class PrintingEnumWithColor {
    void print()
    {
        for(AdvancedEnum.COLOR color : AdvancedEnum.COLOR.values())
        {
            System.out.println(color.getValue());
        }
    }
}
