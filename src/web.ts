import { WebPlugin } from '@capacitor/core';

import type { NearpayImplementationPlugin } from './definitions';

export class NearpayImplementationWeb extends WebPlugin implements NearpayImplementationPlugin {
  initialize(): Promise<{ initialized: boolean; }> {
    throw new Error('Method not implemented.');
  }

}
