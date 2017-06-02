package com.example.android.reportcard;

public class ReportCard {
    public class Administration {
        //Constructor
        public Administration(String schoolName, int year, int term) {
        this.schoolName = schoolName;
        this.year = year;
        this.term = term;
        }
        //Private constant
        private String schoolName;
        private int year;
        private int term;

        // Getter and setter method encapsulation
        public void setSchoolName(String newSchoolName) {
        schoolName = newSchoolName;
        }
        public String getSchoolName() {
        return schoolName;
        }
        public void setYear(int newYear) {
        year = newYear;
        }
        public int getYear() {
        return year;
        }
        public void setTerm(int newTerm) {
            term = newTerm;
        }
        public int getTerm() {
        return term;
        }

        // toString() method will show on the screen the informations of this app
        @Override
        public String toString() {
        return "School year:" + this.year + "\nTerm : " + this.term + "\nSchool name:" + this.schoolName;
        }
    } 

    public class GradeOfStudent {
        private String studentName;
        private int sectionClass;
        private int gradeOfFrench;
        private int gradeOfEnglish;
        private int gradeOfLatin;
        private int gradeOfLiterature;
        private int gradeOfScience;
        private int gradeOfMaths;
        private int gradeOfSports;
        private int gradeOfDiscipline;

        // Getter and setter method encapsulation
        // Student name
        public void setStudentName(String newStudentName) {
        studentName = newStudentName;
        }

        public String getStudentName() {
        return studentName;
        }

        //For section class
        public void setSectionClass(int newSectionClass) {
        sectionClass = newSectionClass;
        }

        public int getSectionClass() {
        return sectionClass;
        }

        //French grade
        public void setGradeOfFrench(int NewGradeOfFrench) {
        gradeOfFrench = NewGradeOfFrench;
        }

        public int getGradeOfFrench() {
        return gradeOfFrench;
        }

        //English grade
        public void setGradeOfEnglish(int NewGradeOfEnglish) {
        gradeOfEnglish = NewGradeOfEnglish;
        }

        public int getGradeOfEnglish() {
        return gradeOfEnglish;
        }

        //Latin grade
        public void setGradeOfLatin(int NewGradeOfLatin) {
        gradeOfLatin = NewGradeOfLatin;
        }

        public int getGradeOfLatin() {
            return gradeOfLatin;
        }

        //Literature grade
        public void setGradeOfLiterature(int NewGradeOfLiterature) {
        gradeOfLiterature = NewGradeOfLiterature;
        }

        public int getGradeOfLiterature() {
        return gradeOfLiterature;
        }

        //Science grade
        public void setGradeOfScience(int NewGradeOfScience) {
        gradeOfScience = NewGradeOfScience;
        }

        public int getGradeOfScience() {
            return gradeOfScience;
        }

        //Maths grade
        public void setGradeOfMaths(int NewGradeOfMaths) {
            gradeOfMaths = NewGradeOfMaths;
        }

        public int getGradeOfMaths() {
        return gradeOfMaths;
        }

        //Sports grade
        public void setGradeOfSports(int NewGradeOfSports) {
        gradeOfSports = NewGradeOfSports;
        }

        public int getGradeOfSports() {
        return gradeOfSports;
        }

        //Discipline grade
        public void setGradeOfDiscipline(int NewGradeOfDiscipline) {
        gradeOfDiscipline = NewGradeOfDiscipline;
        }

        public int getGradeOfDiscipline() {
        return gradeOfDiscipline;
        }

        //Constructor
        public GradeOfStudent(String studentName, int sectionClass, int gradeOfFrench, int gradeOfEnglish, int gradeOfLatin, int gradeOfLiterature, int gradeOfScience, int gradeOfMaths, int gradeOfSports, int gradeOfDiscipline) {
        this.studentName = studentName;
        this.sectionClass = sectionClass;
        this.gradeOfFrench = gradeOfFrench;
        this.gradeOfEnglish = gradeOfEnglish;
        this.gradeOfLatin = gradeOfLatin;
        this.gradeOfLiterature = gradeOfLiterature;
        this.gradeOfScience = gradeOfScience;
        this.gradeOfMaths = gradeOfMaths;
        this.gradeOfSports = gradeOfSports;
        this.gradeOfDiscipline = gradeOfDiscipline;
        }

        // toString() method will show on the screen the informations of this app
        @Override
        public String toString() {
        return "Name of the student:" + this.studentName + "\nClass : " + this.sectionClass + "Grading system goes 10 to 20 points, total average calculate at each term of the current school year, ..." + "\nFrench note:" + this.gradeOfFrench + "\nEnglish note:" + this.gradeOfEnglish + "etc." + "\nNote of the discipline of your child" + this.gradeOfDiscipline;
        }
    } 
} // End ReportCard

