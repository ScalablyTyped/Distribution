package typings
package zeromqLib.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var _fd: scala.Double
  var _ioevents: scala.Double
  var _receiveMore: scala.Double
  var _subscribe: scala.Double
  var _unsubscribe: scala.Double
  var affinity: scala.Double
  var backlog: scala.Double
  var curve_publickey: scala.Double
  var curve_secretkey: scala.Double
  var curve_server: scala.Double
  var curve_serverkey: scala.Double
  var hwm: scala.Double
  var identity: scala.Double
  var last_endpoint: scala.Double
  var linger: scala.Double
  var mcast_loop: scala.Double
  var mechanism: scala.Double
  var plain_password: scala.Double
  var plain_server: scala.Double
  var plain_username: scala.Double
  var rate: scala.Double
  var rcvbuf: scala.Double
  var reconnect_ivl: scala.Double
  var recovery_ivl: scala.Double
  var sndbuf: scala.Double
  var swap: scala.Double
  var zap_domain: scala.Double
}

object SocketOptions {
  @scala.inline
  def apply(
    _fd: scala.Double,
    _ioevents: scala.Double,
    _receiveMore: scala.Double,
    _subscribe: scala.Double,
    _unsubscribe: scala.Double,
    affinity: scala.Double,
    backlog: scala.Double,
    curve_publickey: scala.Double,
    curve_secretkey: scala.Double,
    curve_server: scala.Double,
    curve_serverkey: scala.Double,
    hwm: scala.Double,
    identity: scala.Double,
    last_endpoint: scala.Double,
    linger: scala.Double,
    mcast_loop: scala.Double,
    mechanism: scala.Double,
    plain_password: scala.Double,
    plain_server: scala.Double,
    plain_username: scala.Double,
    rate: scala.Double,
    rcvbuf: scala.Double,
    reconnect_ivl: scala.Double,
    recovery_ivl: scala.Double,
    sndbuf: scala.Double,
    swap: scala.Double,
    zap_domain: scala.Double
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_fd")(_fd)
    __obj.updateDynamic("_ioevents")(_ioevents)
    __obj.updateDynamic("_receiveMore")(_receiveMore)
    __obj.updateDynamic("_subscribe")(_subscribe)
    __obj.updateDynamic("_unsubscribe")(_unsubscribe)
    __obj.updateDynamic("affinity")(affinity)
    __obj.updateDynamic("backlog")(backlog)
    __obj.updateDynamic("curve_publickey")(curve_publickey)
    __obj.updateDynamic("curve_secretkey")(curve_secretkey)
    __obj.updateDynamic("curve_server")(curve_server)
    __obj.updateDynamic("curve_serverkey")(curve_serverkey)
    __obj.updateDynamic("hwm")(hwm)
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("last_endpoint")(last_endpoint)
    __obj.updateDynamic("linger")(linger)
    __obj.updateDynamic("mcast_loop")(mcast_loop)
    __obj.updateDynamic("mechanism")(mechanism)
    __obj.updateDynamic("plain_password")(plain_password)
    __obj.updateDynamic("plain_server")(plain_server)
    __obj.updateDynamic("plain_username")(plain_username)
    __obj.updateDynamic("rate")(rate)
    __obj.updateDynamic("rcvbuf")(rcvbuf)
    __obj.updateDynamic("reconnect_ivl")(reconnect_ivl)
    __obj.updateDynamic("recovery_ivl")(recovery_ivl)
    __obj.updateDynamic("sndbuf")(sndbuf)
    __obj.updateDynamic("swap")(swap)
    __obj.updateDynamic("zap_domain")(zap_domain)
    __obj.asInstanceOf[SocketOptions]
  }
}

