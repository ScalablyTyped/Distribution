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
    val __obj = js.Dynamic.literal(_fd = _fd.asInstanceOf[js.Any], _ioevents = _ioevents.asInstanceOf[js.Any], _receiveMore = _receiveMore.asInstanceOf[js.Any], _subscribe = _subscribe.asInstanceOf[js.Any], _unsubscribe = _unsubscribe.asInstanceOf[js.Any], affinity = affinity.asInstanceOf[js.Any], backlog = backlog.asInstanceOf[js.Any], hwm = hwm.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], last_endpoint = last_endpoint.asInstanceOf[js.Any], linger = linger.asInstanceOf[js.Any], mcast_loop = mcast_loop.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], rcvbuf = rcvbuf.asInstanceOf[js.Any], reconnect_ivl = reconnect_ivl.asInstanceOf[js.Any], recovery_ivl = recovery_ivl.asInstanceOf[js.Any], sndbuf = sndbuf.asInstanceOf[js.Any], swap = swap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketOptions]
  }
}

