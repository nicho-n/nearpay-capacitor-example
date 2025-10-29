import { WebPlugin } from '@capacitor/core';

import type { NearpayImplementationPlugin } from './definitions';

export class NearpayImplementationWeb extends WebPlugin implements NearpayImplementationPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
