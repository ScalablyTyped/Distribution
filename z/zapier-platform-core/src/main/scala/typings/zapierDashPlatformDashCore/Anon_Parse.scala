package typings.zapierDashPlatformDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Parse extends js.Object {
  @JSName("stringify")
  var stringify_Original: Fn_Key = js.native
  /**
    * Acts a lot like regular `JSON.parse`, but throws a nice error for improper json input
    */
  def parse(text: String): js.Any = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
    space: String
  ): String = js.native
  def stringify(
    value: js.Any,
    replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
    space: Double
  ): String = js.native
  def stringify(value: js.Any, replacer: Null, space: String): String = js.native
  def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
}

