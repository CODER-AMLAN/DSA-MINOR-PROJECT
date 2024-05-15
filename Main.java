package A2341014053;
class Date {
        private int day;
        private String month;
        private int year;
    
        Date(int day, String month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        int getDay(){
            return day;
        }
        String getMonth(){
            return month;
        }
        int getYear(){
            return year;
        }
        
    }
  
    class Member {
        private int memberID;
        private String lastName;
        private String firstName;
        private int handicap;
        private char gender;
        private String team;
        private String memberType;
        private int coach;
        private long phone;
        private Date joinDate;
    
         Member(int memberID, String lastName, String firstName, int handicap, char gender, String team,
                String memberType, int coach, long phone, Date joinDate) {
            this.memberID = memberID;
            this.lastName = lastName;
            this.firstName = firstName;
            this.handicap = handicap;
            this.gender = gender;
            this.team = team;
            this.memberType = memberType;
            this.coach = coach;
            this.phone = phone;
            this.joinDate = joinDate;
        }
        void display() {
            System.out.printf("%-19s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                    "Member ID: " + memberID,
                    "Last Name: " + lastName,
                    "First Name: " + firstName,
                    "Handicap: " + handicap,
                    "Gender: " + gender,
                    "Team: " + team,
                    "Member Type: " + memberType,
                    "Coach: " + coach,
                    "Phone: " + phone,
                    "Join Date: " + joinDate.getDay() + "-" + joinDate.getMonth() + "-"
                            + String.valueOf(joinDate.getYear()).substring(2));
        }
    
    
        Date getJoinDate(){
            return joinDate;
        }
        String getMemberType(){
            return memberType;
        }
        int getHandicap(){
            return handicap;
        }
        char getGender(){
            return gender;
        }
        String getTeam(){
            return team;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Member[]member = new Member[20];
            member[0]=new Member(118,"McKenzie", "Mellisa", 30, 'F', null, "Junior", 153, 963270, new Date(28,"May",2005));
            member[1]=new Member(138,"Stone", "Michael", 30, 'M', null, "Senior", 0, 983223, new Date(31,"May",2009));
            member[2]=new Member(153,"Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 0, 442649, new Date(12,"Aug",2006));
            member[3]=new Member(176,"Branch", "Helen", 0, 'F', null, "Social", 0, 589419, new Date(6,"Dec",2011));
            member[4]=new Member(178,"Beck", "Sarah", 0, 'F', null, "Social", 0, 226596, new Date(24,"Jan",2010));
            member[5]=new Member(228,"Burton", "Sandra", 26, 'F', null, "Junior", 153,244493, new Date(9,"July",2013));
            member[6]=new Member(235,"Cooper", "William", 14, 'M', "TeamB", "Senior",153, 722954, new Date(5,"Mar",2008));
            member[7]=new Member(239,"Spence", "Thomas", 10, 'M', null, "Senior", 0, 697720, new Date(22,"Jun",2006));
            member[8]=new Member(258,"Olson", "Barbara", 16, 'F', null, "Senior", 0, 370186, new Date(29,"Jul",2013));
            member[9]=new Member(286,"Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235, 617681, new Date(13,"Aug",2013));
            member[10]=new Member(290,"Sexton", "Thomas", 26, 'M', null, "Senior",235, 268936, new Date(28,"Jul",2008));
            member[11]=new Member(323,"Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 0, 665393, new Date(18,"May",2009));
            member[12]=new Member(331,"Schmidt", "Thomas", 25, 'M', null, "Senior",153, 867492, new Date(7,"Apr",2009));
            member[13]=new Member(332,"Bridges", "Deborah", 12, 'F', null, "Senior",235, 279087, new Date(23,"Mar",2007));
            member[14]=new Member(339,"Young", "Betty", 21, 'F', "TeamB", "Senior", 0, 507813, new Date(17,"Apr",2009));
            member[15]=new Member(414,"Gilmore", "Jane", 5, 'F', "TeamA", "Junior",153, 459558, new Date(30,"May",2007));
            member[16]=new Member(415,"Taylor", "William", 7, 'M', "TeamA", "Senior",235, 137353, new Date(27,"Nov",2007));
            member[17]=new Member(461,"Reed", "Robert", 3, 'M', "TeamA", "Senior",235, 994664, new Date(5,"Aug",2005));
            member[18]=new Member(469,"Willis", "Carolyn", 29, 'F', null, "Junior", 0, 688378, new Date(14,"Jan",2011));
            member[19]=new Member(487,"Kent", "Susan", 0, 'F', null, "Social", 0, 707217, new Date(7,"Oct",2010));
            
            //Displays the records where the member’s JoinDate is earlier than 07-Apr-09
            System.out.println("Records of the members who joined before 07-Apr-2009: ");
            int sl=1;
            for (int i = 0; i < 20; i++) {
                if (member[i].getJoinDate().getYear() < 2009
                        || member[i].getJoinDate().getYear() == 2009 && member[i].getJoinDate().getMonth().equals("Jan")
                        || member[i].getJoinDate().getMonth().equals("Mar")
                        || member[i].getJoinDate().getMonth().equals("Apr") && member[i].getJoinDate().getDay() < 7) {
                   System.out.print(sl+"."); 
                            member[i].display();
                            sl++;
                }
            }
            sl=1;
            System.out.println();
            
            //Display the records of all the senior members whose handicap score is less than 12. 
            System.out.println("Records of all the senior members whose handicap score is less than 12: ");
            for(int i=0;i<20;i++){
                if(member[i].getMemberType().equals("Senior")&&member[i].getHandicap()<12 && member[i].getHandicap()>0){
                    System.out.print(sl+".");
                    member[i].display();
                    sl++;
                }
            }
            sl=1;
            System.out.println();
            
            //Display the records of all the female senior members who are part of TeamB. 
            System.out.println("Records of all the female senior members who are part of TeamB: ");
            for (int i = 0; i < 20; i++) {
                if (member[i].getMemberType().equals("Senior") && member[i].getGender() == 'F'
                        && member[i].getTeam() != null && member[i].getTeam().equals("TeamB")) {
                    System.out.print(sl + ".");
                    member[i].display();
                    sl++;
                }
            }
    
    
        }
    }
