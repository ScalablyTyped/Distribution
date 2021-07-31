package typings.yup.mod

import typings.yup.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("yup", "array")
@js.native
// tslint:disable-next-line:no-unnecessary-generics
class array[C] ()
  extends StObject
     with NotRequiredArraySchema[js.Object, C]
object array {
  
  @scala.inline
  def apply: ArraySchemaConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("array").asInstanceOf[ArraySchemaConstructor]
}
