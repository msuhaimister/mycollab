/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.project.view;

import com.mycollab.vaadin.mvp.ScreenData;
import com.mycollab.vaadin.web.ui.AbstractPresenter;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.HasComponents;

/**
 * @author MyCollab Ltd.
 * @since 1.0
 */
public class FollowingTicketPresenter extends AbstractPresenter<FollowingTicketView> {
    private static final long serialVersionUID = 1L;

    public FollowingTicketPresenter() {
        super(FollowingTicketView.class);
    }

    @Override
    protected void viewAttached() {
        view.getSearchHandlers().addSearchHandler(criteria -> view.getPagedBeanTable().setSearchCriteria(criteria));
    }

    @Override
    protected void onGo(HasComponents container, ScreenData<?> data) {
        ((ComponentContainer) container).addComponent(view);
        view.displayTickets();
    }
}
