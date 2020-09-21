import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private _studentUrl = "http://localhost:8086/api/student/allStudents";
  private _courseUrl = "http://localhost:8086/api/courses/allCourses";
  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(this._courseUrl);
  }
}
