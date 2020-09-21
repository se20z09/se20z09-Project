import { Routes } from '@angular/router';
import { ContactComponent } from './app/contact/contact.component';
import { Error404Component } from './app/errors/404.component';
import { HelpComponent } from './app/help/help.component';
import { HomeComponent } from './app/home/home.component';
import { StudentListComponent } from './app/student-list/student-list.component';

export const appRoutes: Routes = [
    {path: 'home', component: HomeComponent},
    {path: 'help', component: HelpComponent},
    {path: 'contact', component: ContactComponent},
    { path: 'students', component: StudentListComponent },
    { path: '404', component: Error404Component },
    { path: '', redirectTo: '/home', pathMatch: 'full' }
]