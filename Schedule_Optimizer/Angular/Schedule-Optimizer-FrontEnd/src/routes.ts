import { Routes } from '@angular/router';
import { Error404Component } from './app/errors/404.component';
import { StudentListComponent } from './app/student-list/student-list.component';

export const appRoutes: Routes = [
    { path: 'students', component: StudentListComponent },
    { path: '404', component: Error404Component },
    { path: '', redirectTo: '/students', pathMatch: 'full' }
]