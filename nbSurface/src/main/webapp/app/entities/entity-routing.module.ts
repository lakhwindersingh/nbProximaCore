import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'nb-palette',
        data: { pageTitle: 'nbSurfaceApp.nBPalette.home.title' },
        loadChildren: () => import('./nb-palette/nb-palette.module').then(m => m.NBPaletteModule),
      },
      {
        path: 'nb-map',
        data: { pageTitle: 'nbSurfaceApp.nBMap.home.title' },
        loadChildren: () => import('./nb-map/nb-map.module').then(m => m.NBMapModule),
      },
      {
        path: 'nb-user',
        data: { pageTitle: 'nbSurfaceApp.nBUser.home.title' },
        loadChildren: () => import('./nb-user/nb-user.module').then(m => m.NBUserModule),
      },
      {
        path: 'nb-chart',
        data: { pageTitle: 'nbSurfaceApp.nBChart.home.title' },
        loadChildren: () => import('./nb-chart/nb-chart.module').then(m => m.NBChartModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
