export interface NearpayImplementationPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
