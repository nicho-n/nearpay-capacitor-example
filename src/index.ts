import { registerPlugin } from '@capacitor/core';

import type { NearpayImplementationPlugin } from './definitions';

const NearpayImplementation = registerPlugin<NearpayImplementationPlugin>('NearpayImplementation', {
  web: () => import('./web').then((m) => new m.NearpayImplementationWeb()),
});

export * from './definitions';
export { NearpayImplementation };
