package kotlin_code.part4

import java.io.Serializable

/***
 * 특정 상태를 지정하기위한 인터페이스
 * 그 상태는 Serializable 를 상속받아 직렬화가 가능하다
 */
interface State: Serializable

interface View {

    /***
     * View 의 현 상태를 얻는다
     */
    fun getCurrentState() : State

    /***
     * View 의 상태를 저장한다
     */
    fun restoreState(state: State) {}
}