package typings.zmq.zmqMod

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
  var hwm: Double
  var identity: Double
  var last_endpoint: Double
  var linger: Double
  var mcast_loop: Double
  var rate: Double
  var rcvbuf: Double
  var reconnect_ivl: Double
  var recovery_ivl: Double
  var sndbuf: Double
  var swap: Double
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
    hwm: Double,
    identity: Double,
    last_endpoint: Double,
    linger: Double,
    mcast_loop: Double,
    rate: Double,
    rcvbuf: Double,
    reconnect_ivl: Double,
    recovery_ivl: Double,
    sndbuf: Double,
    swap: Double
  ): SocketOptions = {
    val __obj = js.Dynamic.literal(_fd = _fd, _ioevents = _ioevents, _receiveMore = _receiveMore, _subscribe = _subscribe, _unsubscribe = _unsubscribe, affinity = affinity, backlog = backlog, hwm = hwm, identity = identity, last_endpoint = last_endpoint, linger = linger, mcast_loop = mcast_loop, rate = rate, rcvbuf = rcvbuf, reconnect_ivl = reconnect_ivl, recovery_ivl = recovery_ivl, sndbuf = sndbuf, swap = swap)
  
    __obj.asInstanceOf[SocketOptions]
  }
}

