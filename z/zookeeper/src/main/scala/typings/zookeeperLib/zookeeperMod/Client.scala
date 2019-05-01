package typings
package zookeeperLib.zookeeperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var client_id: js.UndefOr[java.lang.String] = js.native
  var client_password: js.UndefOr[js.Any] = js.native
  var is_unrecoverable: js.UndefOr[scala.Boolean] = js.native
  var state: js.UndefOr[scala.Double] = js.native
  var timeout: js.UndefOr[scala.Double] = js.native
  def a_create(
    path: java.lang.String,
    data: java.lang.String,
    flags: scala.Double,
    callback: Callback[java.lang.String]
  ): scala.Unit = js.native
  def a_create(
    path: java.lang.String,
    data: nodeLib.Buffer,
    flags: scala.Double,
    callback: Callback[java.lang.String]
  ): scala.Unit = js.native
  def a_delete_(path: java.lang.String, version: scala.Double, callback: Callback[scala.Unit]): scala.Unit = js.native
  def a_exists(path: java.lang.String, watch: scala.Boolean, callback: Callback[Stat]): scala.Unit = js.native
  def a_get(
    path: java.lang.String,
    watch: scala.Boolean,
    callback: Callback[nodeLib.Buffer | java.lang.String]
  ): scala.Unit = js.native
  def a_get_acl(path: java.lang.String, callback: acl_callback): scala.Unit = js.native
  def a_get_children(path: java.lang.String, watch: scala.Boolean, callback: Callback[js.Array[java.lang.String]]): scala.Unit = js.native
  def a_get_children2(path: java.lang.String, watch: scala.Boolean, callback: child2_callback): scala.Unit = js.native
  def a_set(path: java.lang.String, data: java.lang.String, version: scala.Double, callback: Callback[Stat]): scala.Unit = js.native
  def a_set(path: java.lang.String, data: nodeLib.Buffer, version: scala.Double, callback: Callback[Stat]): scala.Unit = js.native
  def a_set_acl(path: java.lang.String, version: scala.Double, acl: js.Array[ACL], callback: Callback[scala.Unit]): scala.Unit = js.native
  def add_auth(schema: java.lang.String, auth: java.lang.String, callback: Callback[scala.Unit]): scala.Unit = js.native
  def aw_exists(path: java.lang.String, watch_callback: watch_callback, callback: Callback[Stat]): scala.Unit = js.native
  def aw_get(
    path: java.lang.String,
    watch_callback: watch_callback,
    callback: Callback[nodeLib.Buffer | java.lang.String]
  ): scala.Unit = js.native
  def aw_get_children(
    path: java.lang.String,
    watch_callback: watch_callback,
    callback: Callback[js.Array[java.lang.String]]
  ): scala.Unit = js.native
  def aw_get_children2(path: java.lang.String, watch_callback: watch_callback, callback: child2_callback): scala.Unit = js.native
  def mkdirp(path: java.lang.String, callback: js.Function1[/* e */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
}

