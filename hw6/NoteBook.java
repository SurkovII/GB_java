package hw6;

import java.util.ArrayList;
/*1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет … */
public class NoteBook {
    private int ozu;
    private int memory;
    private String operSystem;
    private String color;
    private String company;
    
    public NoteBook(int ozu, int memory, String operSystem, String color, String company){
        this.company =company;
        this.ozu = ozu;
        this.memory = memory;
        this.operSystem = operSystem;
        this.color = color;
    }
    ArrayList<Object> listFilters = new ArrayList<>();
    public ArrayList<Object> getListFilters(){
        listFilters.add(getozu());
        listFilters.add(getMemory());
        listFilters.add(getOperSystem());
        listFilters.add(getColor());
        listFilters.add(getCompany());
        return listFilters;
    }
    public String getCompany() {
        return company;
    }
    public Integer getozu() {
        return ozu;
    }
    public Integer getMemory() {
        return memory;
    }
    public String getOperSystem() {
        return operSystem;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return company + " " + ozu + " " + memory + " " + operSystem + " " + color;
    }
}
