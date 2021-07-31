package typings.yup.mod

import typings.yup.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("yup", "bool")
@js.native
// tslint:disable-next-line:no-unnecessary-generics
class bool[T /* <: js.UndefOr[Boolean | Null] */, C] ()
  extends StObject
     with BooleanSchema[T, C]
object bool {
  
  @scala.inline
  def apply: BooleanSchemaConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("bool").asInstanceOf[BooleanSchemaConstructor]
}
