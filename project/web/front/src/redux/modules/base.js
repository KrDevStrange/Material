import { Map } from "immutable";
import { handleAction, createAction } from "redux-actions";

const SET_HEADER_VISIBILITY = "base/SET_HEADER_VISIBILITY"; //헤더 렌더링 여부 설정

export const setHeaderVisibility = createAction(SET_HEADER_VISIBILITY); //visible

const initialState = Map({
    header: Map({
        visible: true
    })
});

export default handleAction({
    [SET_HEADER_VISIBILITY] : (state, action) => state.setIn(["header", "visible"], action.payload)
}, initialState);

