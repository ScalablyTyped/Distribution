package typings.zenObservable.mod

import typings.std.ArrayLike
import typings.zenObservable.mod.global.ZenObservable.ObservableLike
import typings.zenObservable.mod.global.ZenObservable.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zen-observable", JSImport.Namespace)
@js.native
class ^[T] protected () extends Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}
@JSImport("zen-observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def from[R](observable: ArrayLike[R]): Observable[R] = js.native
  def from[R](observable: Observable[R]): Observable[R] = js.native
  def from[R](observable: ObservableLike[R]): Observable[R] = js.native
  
  def of[R](items: R*): Observable[R] = js.native
}
