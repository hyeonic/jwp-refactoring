package kitchenpos.common.fixture;

import kitchenpos.menugroup.domain.MenuGroup;
import kitchenpos.menugroup.dto.MenuGroupSaveRequest;

public class MenuGroupFixtures {

    public static final MenuGroup generateMenuGroup(final String name) {
        return generateMenuGroup(null, name);
    }

    public static final MenuGroup generateMenuGroup(final Long id, final MenuGroup menuGroup) {
        return generateMenuGroup(id, menuGroup.getName());
    }

    public static final MenuGroup generateMenuGroup(final Long id, final String name) {
        return new MenuGroup(name);
    }

    public static final MenuGroupSaveRequest generateMenuGroupSaveRequest(final String name) {
        return new MenuGroupSaveRequest(name);
    }
}
