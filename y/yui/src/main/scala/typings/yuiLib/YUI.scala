package typings
package yuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YUI extends js.Object {
  var Assert: yuiLib.YUITestNs.IAssert = js.native
  var Test: yuiLib.YUITestNs.YUITestStatic = js.native
  def add(
    name: java.lang.String,
    fn: js.Function2[/* Y */ this.type, /* name */ java.lang.String, _],
    version: java.lang.String
  ): YUI = js.native
  def add(
    name: java.lang.String,
    fn: js.Function2[/* Y */ this.type, /* name */ java.lang.String, _],
    version: java.lang.String,
    details: yuiLib.YNs.IConfig
  ): YUI = js.native
  def mix(receiver: js.Function, supplier: js.Function): js.Any = js.native
  def mix(receiver: js.Function, supplier: js.Function, overwrite: scala.Boolean): js.Any = js.native
  def mix(
    receiver: js.Function,
    supplier: js.Function,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String]
  ): js.Any = js.native
  def mix(
    receiver: js.Function,
    supplier: js.Function,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String],
    mode: scala.Double
  ): js.Any = js.native
  def mix(
    receiver: js.Function,
    supplier: js.Function,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String],
    mode: scala.Double,
    merge: scala.Boolean
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Function, supplier: js.Object): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Function, supplier: js.Object, overwrite: scala.Boolean): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Function,
    supplier: js.Object,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String]
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Function,
    supplier: js.Object,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String],
    mode: scala.Double
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Function,
    supplier: js.Object,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String],
    mode: scala.Double,
    merge: scala.Boolean
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Object, supplier: js.Function): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Object, supplier: js.Function, overwrite: scala.Boolean): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Object,
    supplier: js.Function,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String]
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Object,
    supplier: js.Function,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String],
    mode: scala.Double
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Object,
    supplier: js.Function,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String],
    mode: scala.Double,
    merge: scala.Boolean
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Object, supplier: js.Object): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Object, supplier: js.Object, overwrite: scala.Boolean): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Object,
    supplier: js.Object,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String]
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Object,
    supplier: js.Object,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String],
    mode: scala.Double
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(
    receiver: js.Object,
    supplier: js.Object,
    overwrite: scala.Boolean,
    whitelist: js.Array[java.lang.String],
    mode: scala.Double,
    merge: scala.Boolean
  ): js.Any = js.native
}

