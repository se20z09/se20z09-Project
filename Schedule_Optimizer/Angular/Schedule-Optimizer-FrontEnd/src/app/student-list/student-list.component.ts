import { Component, OnInit } from '@angular/core';
import { StudentService } from '../shared/student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students: Array<any>;
  sampleData: any;
  constructor(private studentService: StudentService) { }

  columns = [ "Course Code", "Course Name", "Credit"]
  index = [ "coursecode", "coursename", "credit"];
  ngOnInit(): void {
    this.studentService.getAll().subscribe(data => {
      this.students = data;
      let ff = [], fs = [], sf = [], ss = [], jf = [], js = [], s = [], cre = [];
      this.students.forEach(function(elt) {
        if(elt.courseyear == "Freshman" && elt.semester =="Fall") {
          ff.push(elt);
        } else if(elt.courseyear == "Freshman" && elt.semester =="Spring") {
          fs.push(elt);
        } else if(elt.courseyear == "Sophomore" && elt.semester =="Fall") {
          sf.push(elt);
        } else if(elt.courseyear == "Sophomore" && elt.semester =="Spring") {
          ss.push(elt);
        } else if(elt.courseyear == "Junior" && elt.semester =="Fall") {
          jf.push(elt);
        } else if(elt.courseyear == "Junior" && elt.semester =="Spring") {
          js.push(elt);
        } else if(elt.courseyear == "Senior" && elt.semester =="All") {
          s.push(elt);
        } else if(elt.courseyear == "CSC Restricted Electives" && elt.semester =="All") {
          cre.push(elt);
        }
      });
      this.sampleData = [
        {Field: 'Freshman Fall', Value: ff, Cl:"ff"},
        {Field: 'Freshman Spring', Value: fs, Cl: "fs"},
        {Field: 'Sophomore Fall', Value: sf, Cl: 'sf'},
        {Field: 'Sophomore Spring', Value: ss, Cl: ss},
        {Field: 'Junior Fall', Value: jf, Cl: "jf"},
        {Field: 'Junior Spring', Value: js, Cl: "js"},
        {Field: 'Senior', Value: s, Cl: "s"},
        {Field: 'CSC Restricted Electives', Value: cre, Cl: 'cre'},
      ]; 
    });
  }
}
