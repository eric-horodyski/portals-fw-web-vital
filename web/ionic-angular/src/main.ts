import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

import reportWebVitals from './reportWebVitals';

if (environment.production) {
  enableProdMode();
}

reportWebVitals(console.log);

platformBrowserDynamic()
  .bootstrapModule(AppModule)
  .catch((err) => console.log(err));
