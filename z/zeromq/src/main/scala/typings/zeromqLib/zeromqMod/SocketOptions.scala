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
    val __obj = js.Dynamic.literal(_fd = _fd, _ioevents = _ioevents, _receiveMore = _receiveMore, _subscribe = _subscribe, _unsubscribe = _unsubscribe, affinity = affinity, backlog = backlog, curve_publickey = curve_publickey, curve_secretkey = curve_secretkey, curve_server = curve_server, curve_serverkey = curve_serverkey, hwm = hwm, identity = identity, last_endpoint = last_endpoint, linger = linger, mcast_loop = mcast_loop, mechanism = mechanism, plain_password = plain_password, plain_server = plain_server, plain_username = plain_username, rate = rate, rcvbuf = rcvbuf, reconnect_ivl = reconnect_ivl, recovery_ivl = recovery_ivl, sndbuf = sndbuf, swap = swap, zap_domain = zap_domain)
  
    __obj.asInstanceOf[SocketOptions]
  }
}

