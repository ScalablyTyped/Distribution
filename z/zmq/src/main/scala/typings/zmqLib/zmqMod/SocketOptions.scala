package typings
package zmqLib.zmqMod

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
  var hwm: scala.Double
  var identity: scala.Double
  var last_endpoint: scala.Double
  var linger: scala.Double
  var mcast_loop: scala.Double
  var rate: scala.Double
  var rcvbuf: scala.Double
  var reconnect_ivl: scala.Double
  var recovery_ivl: scala.Double
  var sndbuf: scala.Double
  var swap: scala.Double
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
    hwm: scala.Double,
    identity: scala.Double,
    last_endpoint: scala.Double,
    linger: scala.Double,
    mcast_loop: scala.Double,
    rate: scala.Double,
    rcvbuf: scala.Double,
    reconnect_ivl: scala.Double,
    recovery_ivl: scala.Double,
    sndbuf: scala.Double,
    swap: scala.Double
  ): SocketOptions = {
    val __obj = js.Dynamic.literal(_fd = _fd, _ioevents = _ioevents, _receiveMore = _receiveMore, _subscribe = _subscribe, _unsubscribe = _unsubscribe, affinity = affinity, backlog = backlog, hwm = hwm, identity = identity, last_endpoint = last_endpoint, linger = linger, mcast_loop = mcast_loop, rate = rate, rcvbuf = rcvbuf, reconnect_ivl = reconnect_ivl, recovery_ivl = recovery_ivl, sndbuf = sndbuf, swap = swap)
  
    __obj.asInstanceOf[SocketOptions]
  }
}

