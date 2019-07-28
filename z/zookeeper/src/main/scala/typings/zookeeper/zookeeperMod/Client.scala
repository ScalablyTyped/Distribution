package typings.zookeeper.zookeeperMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var client_id: js.UndefOr[String] = js.native
  var client_password: js.UndefOr[js.Any] = js.native
  var is_unrecoverable: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  def a_create(path: String, data: String, flags: Double, callback: Callback[String]): Unit = js.native
  def a_create(path: String, data: Buffer, flags: Double, callback: Callback[String]): Unit = js.native
  def a_delete_(path: String, version: Double, callback: Callback[Unit]): Unit = js.native
  def a_exists(path: String, watch: Boolean, callback: Callback[Stat]): Unit = js.native
  def a_get(path: String, watch: Boolean, callback: Callback[Buffer | String]): Unit = js.native
  def a_get_acl(path: String, callback: acl_callback): Unit = js.native
  def a_get_children(path: String, watch: Boolean, callback: Callback[js.Array[String]]): Unit = js.native
  def a_get_children2(path: String, watch: Boolean, callback: child2_callback): Unit = js.native
  def a_set(path: String, data: String, version: Double, callback: Callback[Stat]): Unit = js.native
  def a_set(path: String, data: Buffer, version: Double, callback: Callback[Stat]): Unit = js.native
  def a_set_acl(path: String, version: Double, acl: js.Array[ACL], callback: Callback[Unit]): Unit = js.native
  def add_auth(schema: String, auth: String, callback: Callback[Unit]): Unit = js.native
  def aw_exists(path: String, watch_callback: watch_callback, callback: Callback[Stat]): Unit = js.native
  def aw_get(path: String, watch_callback: watch_callback, callback: Callback[Buffer | String]): Unit = js.native
  def aw_get_children(path: String, watch_callback: watch_callback, callback: Callback[js.Array[String]]): Unit = js.native
  def aw_get_children2(path: String, watch_callback: watch_callback, callback: child2_callback): Unit = js.native
  def mkdirp(path: String, callback: js.Function1[/* e */ js.UndefOr[Error], Unit]): Unit = js.native
}

