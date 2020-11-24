package typings.zenObservableTs.zenObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zen-observable-ts/lib/zenObservable", "Observable")
@js.native
class ObservableCls[T] protected () extends Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}
