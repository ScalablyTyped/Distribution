package typings.yup.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceSet
  extends StObject
     with Set[Any | Reference[Any]] {
  
  def describe(): js.Array[Any] = js.native
  
  def merge(newItems: ReferenceSet, removeItems: ReferenceSet): ReferenceSet = js.native
  
  def resolveAll(resolve: js.Function1[/* v */ Any | Reference[Any], Any]): js.Array[Any] = js.native
}
