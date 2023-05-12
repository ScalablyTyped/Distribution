package typings.yup.mod

import typings.yup.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reference[TValue] extends StObject {
  
  val __isYupRef: Boolean = js.native
  
  /**
    *
    * @param {*} value
    * @param {Object} options
    * @param {Object=} options.context
    * @param {Object=} options.parent
    */
  def cast(value: Any): TValue = js.native
  def cast(value: Any, options: Context): TValue = js.native
  
  def describe(): SchemaRefDescription = js.native
  
  def getValue(value: Any): TValue = js.native
  def getValue(value: Any, parent: js.Object): TValue = js.native
  def getValue(value: Any, parent: js.Object, context: js.Object): TValue = js.native
  def getValue(value: Any, parent: Unit, context: js.Object): TValue = js.native
  
  def getter(data: Any): Any = js.native
  
  val isContext: Boolean = js.native
  
  val isSibling: Boolean = js.native
  
  val isValue: Boolean = js.native
  
  val key: String = js.native
  
  val map: js.UndefOr[js.Function1[/* value */ Any, TValue]] = js.native
  
  val path: Any = js.native
  
  def resolve(): this.type = js.native
}
