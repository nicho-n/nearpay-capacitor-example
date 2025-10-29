export interface NearpayImplementationPlugin {
  initialize(): Promise<{ initialized: boolean }>;
}
