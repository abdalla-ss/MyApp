    import java.util.Scanner;
    public class Medical_form extends License_Application{
        private String blood_group;
        private String blood_preasure;
        private String Sickle_cell;
        private String mental_desease;

        public Medical_form(){

        }

        public Medical_form(int Age,String Address,String District,String Reginal,int ZanzibarID,String blood_group,String blood_preasure,String Sickle_cell,String mental_desease){
            super(Age,Address,District,Reginal,ZanzibarID);
            this.blood_group=blood_group;
            this.blood_preasure=blood_preasure;
            this.Sickle_cell=Sickle_cell;
            this.mental_desease=mental_desease;
        }

        public void setblood_group(){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the blood_group");
            String blood_group=input.nextLine();
            this.blood_group=blood_group;
        }
        public String getblood_group(){
            return blood_group;
        }

        public void setblood_preasure(){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the blood_preasure");
            String blood_preasure=input.nextLine();
            this.blood_preasure=blood_preasure;
        }
        public String getblood_preasure(){
            return blood_preasure;
        }

        public void setSickle_cell(){
            Scanner input=new Scanner(System.in);
            System.out.println("Are you have Sickle_cell type Yes or no");
            String Sickle_cell=input.nextLine();
            this.Sickle_cell=Sickle_cell;
        }
        public String getSickle_cell(){
            return Sickle_cell;
        }

        public void setmental_desease(){
            Scanner input=new Scanner(System.in);
            System.out.println("Are you have mental_desease type Yes or no");
            String mental_desease=input.nextLine();
            this.mental_desease=mental_desease;
        }
        public String getmental_desease(){
            return mental_desease;
        }
        
        public String toStringb(){
            return ("The blood group is "+getblood_group()+" the blood "+getblood_preasure()+" and the getSickle_cell "+getSickle_cell()+"and the getmental_desease "+getmental_desease());
        }
        
}