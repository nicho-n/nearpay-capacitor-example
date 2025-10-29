import { NearpayImplementation } from 'nearpay-capacitor-plugin-example';

window.initializeNearpay = () => {
    const inputValue = document.getElementById("echoInput").value;
    NearpayImplementation.initialize();
}
