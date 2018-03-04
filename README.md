# Android-Kotlin-Dependency-Injection-Playground

The Android Kotlin dependency injection playground project is a personal learning exercise with the goal of practicing various approaches to dependency injection on Android using Kotlin.


## Explore the samples

This project hosts the same sample application implemented using different dependency injectors for Android. Each framework is under a separate branch.

### Completed samples

<table>
  <tr>
    <th>Sample</th>
    <th>Description</th>
  </tr>
  <tr>
    <td><a href="https://github.com/husaynhakeem/Android-Kotlin-Dependency-Injection-Playground/tree/dagger2">Dagger 2</a></td>
    <td>Uses <a href="https://google.github.io/dagger/">Dagger 2</a> to add support for <a href="https://en.wikipedia.org/wiki/Dependency_injection">dependency injection</a>.<br/>
      Some Dagger 2 features used in this sample:<br/>
      <ul>
        <li>Component</li>
        <li>Module</li>
        <li>Component dependencies</li>
        <li>Scopes</li>
        <li>Compoenent provision and injection methods</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td><a href="https://github.com/husaynhakeem/Android-Kotlin-Dependency-Injection-Playground/tree/koin">Koin</a></td>
    <td>Uses <a href="https://github.com/Ekito/koin">koin</a> to add support for dependency injection.<br/>
      Some Koin features used in this sample:<br/>
      <ul>
        <li>Module</li>
        <li>Context</li>
        <li>Bean</li>
        <li>Factory</li>
        <li>Dynamic parameters</li>
      </ul>
    </td>
  </tr>
</table>

### Samples in progress

| Sample | Description |
| ------------- | ------------- |
| [Kodein](https://github.com/husaynhakeem/Android-Kotlin-Dependency-Injection-Playground/tree/kodein) | Uses [Kodein](https://github.com/SalomonBrys/Kodein) to add support for dependency injection. |


## The sample app

The chosen sample application is simple enough that one can understand it pretty fast, but intentionaly a bit more complex -than one would normally implement in a real world scenario- so as to implement as many features provided by the used dependency injection frameworks.

<img src="https://github.com/husaynhakeem/Android-Kotlin-Dependency-Injection-Playground/blob/master/app/images/android_kotlin_di_playground_screens.png" alt="Android Kotlin DI playground screens">
