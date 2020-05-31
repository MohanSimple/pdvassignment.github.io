import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProspectSetComponent } from './prospect-set/prospect-set.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CustomerComponent } from './prospect-set/customer/customer.component';
import { DefaultPageComponent } from './prospect-set/default-page/default-page.component';


const routes: Routes = [
  {path:"", pathMatch:"full", redirectTo:"prospect-set"},
  {path:"prospect-set", component:ProspectSetComponent, children: [{path:"", redirectTo:"default", pathMatch:"full"},{path:"default", component:DefaultPageComponent},{path:"customer", component:CustomerComponent },{path:"**", component:PageNotFoundComponent}]},
  {path:"**", component:PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingModules =[ProspectSetComponent,CustomerComponent,PageNotFoundComponent]