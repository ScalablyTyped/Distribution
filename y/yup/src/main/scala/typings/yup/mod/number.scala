package typings.yup.mod

import typings.yup.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("yup", "number")
@js.native
// tslint:disable-next-line:no-unnecessary-generics
class number[T /* <: js.UndefOr[Double | Null] */, C] ()
  extends StObject
     with NumberSchema[T, C]
object number {
  
  @scala.inline
  def apply: NumberSchemaConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("number").asInstanceOf[NumberSchemaConstructor]
}
