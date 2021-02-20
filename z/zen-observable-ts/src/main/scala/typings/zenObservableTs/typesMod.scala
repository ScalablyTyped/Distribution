package typings.zenObservableTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  object ZenObservable {
    
    @js.native
    trait ObservableLike[T] extends StObject {
      
      var subscribe: js.UndefOr[Subscriber[T]] = js.native
    }
    object ObservableLike {
      
      @scala.inline
      def apply[T](): ObservableLike[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ObservableLike[T]]
      }
      
      @scala.inline
      implicit class ObservableLikeMutableBuilder[Self <: ObservableLike[_], T] (val x: Self with ObservableLike[T]) extends AnyVal {
        
        @scala.inline
        def setSubscribe(value: /* observer */ SubscriptionObserver[T] => Unit | js.Function0[Unit] | Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      }
    }
    
    @js.native
    trait Observer[T] extends StObject {
      
      var complete: js.UndefOr[js.Function0[Unit]] = js.native
      
      var error: js.UndefOr[js.Function1[/* errorValue */ js.Any, Unit]] = js.native
      
      var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
      
      var start: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.native
    }
    object Observer {
      
      @scala.inline
      def apply[T](): Observer[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Observer[T]]
      }
      
      @scala.inline
      implicit class ObserverMutableBuilder[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
        
        @scala.inline
        def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
        
        @scala.inline
        def setError(value: /* errorValue */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
        
        @scala.inline
        def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        @scala.inline
        def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
        
        @scala.inline
        def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
        
        @scala.inline
        def setStart(value: /* subscription */ Subscription => _): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    type Subscriber[T] = js.Function1[/* observer */ SubscriptionObserver[T], Unit | js.Function0[Unit] | Subscription]
    
    @js.native
    trait Subscription extends StObject {
      
      var closed: Boolean = js.native
      
      def unsubscribe(): Unit = js.native
    }
    object Subscription {
      
      @scala.inline
      def apply(closed: Boolean, unsubscribe: () => Unit): Subscription = {
        val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
        __obj.asInstanceOf[Subscription]
      }
      
      @scala.inline
      implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait SubscriptionObserver[T] extends StObject {
      
      var closed: Boolean = js.native
      
      def complete(): Unit = js.native
      
      def error(errorValue: js.Any): Unit = js.native
      
      def next(value: T): Unit = js.native
    }
    object SubscriptionObserver {
      
      @scala.inline
      def apply[T](closed: Boolean, complete: () => Unit, error: js.Any => Unit, next: T => Unit): SubscriptionObserver[T] = {
        val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
        __obj.asInstanceOf[SubscriptionObserver[T]]
      }
      
      @scala.inline
      implicit class SubscriptionObserverMutableBuilder[Self <: SubscriptionObserver[_], T] (val x: Self with SubscriptionObserver[T]) extends AnyVal {
        
        @scala.inline
        def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
        
        @scala.inline
        def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
        
        @scala.inline
        def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      }
    }
  }
}
