public class ElonsToyCar {

    public int meters;
    public int percentage = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.meters + " meters"; 
    }

    public String batteryDisplay() {
        
        if(this.percentage > 0){
        return "Battery at " + this.percentage + "%"; 
        }

        return "Battery empty"; 
    }

    public void drive() {
        if(percentage > 0){
            meters = meters + 20;
            percentage = percentage - 1;
        }
    }
}
