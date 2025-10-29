import { NearpayImplementation } from 'nearpay-capacitor-plugin-example';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    NearpayImplementation.echo({ value: inputValue })
}
