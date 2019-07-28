package typings.zeromq.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var _fd: Double
  var _ioevents: Double
  var _receiveMore: Double
  var _subscribe: Double
  var _unsubscribe: Double
  var affinity: Double
  var backlog: Double
  var curve_publickey: Double
  var curve_secretkey: Double
  var curve_server: Double
  var curve_serverkey: Double
  var hwm: Double
  var identity: Double
  var last_endpoint: Double
  var linger: Double
  var mcast_loop: Double
  var mechanism: Double
  var plain_password: Double
  var plain_server: Double
  var plain_username: Double
  var rate: Double
  var rcvbuf: Double
  var reconnect_ivl: Double
  var recovery_ivl: Double
  var sndbuf: Double
  var swap: Double
  var zap_domain: Double
}

object SocketOptions {
  @scala.inline
  def apply(
    _fd: Double,
    _ioevents: Double,
    _receiveMore: Double,
    _subscribe: Double,
    _unsubscribe: Double,
    affinity: Double,
    backlog: Double,
    curve_publickey: Double,
    curve_secretkey: Double,
    curve_server: Double,
    curve_serverkey: Double,
    hwm: Double,
    identity: Double,
    last_endpoint: Double,
    linger: Double,
    mcast_loop: Double,
    mechanism: Double,
    plain_password: Double,
    plain_server: Double,
    plain_username: Double,
    rate: Double,
    rcvbuf: Double,
    reconnect_ivl: Double,
    recovery_ivl: Double,
    sndbuf: Double,
    swap: Double,
    zap_domain: Double
  ): SocketOptions = {
    val __obj = js.Dynamic.literal(_fd = _fd, _ioevents = _ioevents, _receiveMore = _receiveMore, _subscribe = _subscribe, _unsubscribe = _unsubscribe, affinity = affinity, backlog = backlog, curve_publickey = curve_publickey, curve_secretkey = curve_secretkey, curve_server = curve_server, curve_serverkey = curve_serverkey, hwm = hwm, identity = identity, last_endpoint = last_endpoint, linger = linger, mcast_loop = mcast_loop, mechanism = mechanism, plain_password = plain_password, plain_server = plain_server, plain_username = plain_username, rate = rate, rcvbuf = rcvbuf, reconnect_ivl = reconnect_ivl, recovery_ivl = recovery_ivl, sndbuf = sndbuf, swap = swap, zap_domain = zap_domain)
  
    __obj.asInstanceOf[SocketOptions]
  }
}

