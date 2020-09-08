import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private _studentUrl = "http://localhost:8084/api/student/allStudents";
  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(this._studentUrl);
  }
}
